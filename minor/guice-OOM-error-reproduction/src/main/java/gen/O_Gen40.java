
  package gen;
  public class O_Gen40 {
  		@com.google.inject.Inject
  		public O_Gen40(O_Gen41 o_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  