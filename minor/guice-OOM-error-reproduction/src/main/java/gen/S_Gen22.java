
  package gen;
  public class S_Gen22 {
  		@com.google.inject.Inject
  		public S_Gen22(S_Gen23 s_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  