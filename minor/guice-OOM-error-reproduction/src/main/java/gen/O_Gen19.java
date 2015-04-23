
  package gen;
  public class O_Gen19 {
  		@com.google.inject.Inject
  		public O_Gen19(O_Gen20 o_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  