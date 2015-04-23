
  package gen;
  public class S_Gen63 {
  		@com.google.inject.Inject
  		public S_Gen63(S_Gen64 s_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  