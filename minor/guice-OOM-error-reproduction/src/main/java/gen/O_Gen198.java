
  package gen;
  public class O_Gen198 {
  		@com.google.inject.Inject
  		public O_Gen198(O_Gen199 o_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  