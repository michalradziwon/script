
  package gen;
  public class O_Gen143 {
  		@com.google.inject.Inject
  		public O_Gen143(O_Gen144 o_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  