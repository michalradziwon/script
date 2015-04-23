
  package gen;
  public class S_Gen37 {
  		@com.google.inject.Inject
  		public S_Gen37(S_Gen38 s_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  