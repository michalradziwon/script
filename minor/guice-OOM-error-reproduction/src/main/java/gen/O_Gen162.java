
  package gen;
  public class O_Gen162 {
  		@com.google.inject.Inject
  		public O_Gen162(O_Gen163 o_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  