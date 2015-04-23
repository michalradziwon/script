
  package gen;
  public class O_Gen41 {
  		@com.google.inject.Inject
  		public O_Gen41(O_Gen42 o_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  