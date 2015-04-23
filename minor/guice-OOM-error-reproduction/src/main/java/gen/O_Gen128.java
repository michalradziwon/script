
  package gen;
  public class O_Gen128 {
  		@com.google.inject.Inject
  		public O_Gen128(O_Gen129 o_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  