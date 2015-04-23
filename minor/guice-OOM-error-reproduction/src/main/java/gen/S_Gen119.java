
  package gen;
  public class S_Gen119 {
  		@com.google.inject.Inject
  		public S_Gen119(S_Gen120 s_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  