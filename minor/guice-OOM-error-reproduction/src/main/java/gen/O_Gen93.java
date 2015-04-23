
  package gen;
  public class O_Gen93 {
  		@com.google.inject.Inject
  		public O_Gen93(O_Gen94 o_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  