
  package gen;
  public class O_Gen123 {
  		@com.google.inject.Inject
  		public O_Gen123(O_Gen124 o_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  