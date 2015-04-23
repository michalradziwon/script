
  package gen;
  public class S_Gen12 {
  		@com.google.inject.Inject
  		public S_Gen12(S_Gen13 s_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  