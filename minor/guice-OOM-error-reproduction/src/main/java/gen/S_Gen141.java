
  package gen;
  public class S_Gen141 {
  		@com.google.inject.Inject
  		public S_Gen141(S_Gen142 s_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  