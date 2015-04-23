
  package gen;
  public class S_Gen92 {
  		@com.google.inject.Inject
  		public S_Gen92(S_Gen93 s_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  