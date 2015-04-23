
  package gen;
  public class S_Gen58 {
  		@com.google.inject.Inject
  		public S_Gen58(S_Gen59 s_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  