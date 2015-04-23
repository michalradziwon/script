
  package gen;
  public class S_Gen66 {
  		@com.google.inject.Inject
  		public S_Gen66(S_Gen67 s_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  