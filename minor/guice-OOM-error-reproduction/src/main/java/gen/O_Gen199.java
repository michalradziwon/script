
  package gen;
  public class O_Gen199 {
  		@com.google.inject.Inject
  		public O_Gen199(O_Gen200 o_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  