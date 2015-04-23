
  package gen;
  public class O_Gen118 {
  		@com.google.inject.Inject
  		public O_Gen118(O_Gen119 o_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  