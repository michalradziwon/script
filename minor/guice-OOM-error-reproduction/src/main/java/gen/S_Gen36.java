
  package gen;
  public class S_Gen36 {
  		@com.google.inject.Inject
  		public S_Gen36(S_Gen37 s_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  