
  package gen;
  public class O_Gen12 {
  		@com.google.inject.Inject
  		public O_Gen12(O_Gen13 o_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  