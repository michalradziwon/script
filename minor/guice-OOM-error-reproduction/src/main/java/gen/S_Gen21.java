
  package gen;
  public class S_Gen21 {
  		@com.google.inject.Inject
  		public S_Gen21(S_Gen22 s_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  