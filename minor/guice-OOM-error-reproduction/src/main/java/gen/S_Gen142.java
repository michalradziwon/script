
  package gen;
  public class S_Gen142 {
  		@com.google.inject.Inject
  		public S_Gen142(S_Gen143 s_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  