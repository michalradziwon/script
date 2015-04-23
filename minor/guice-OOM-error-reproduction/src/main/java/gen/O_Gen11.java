
  package gen;
  public class O_Gen11 {
  		@com.google.inject.Inject
  		public O_Gen11(O_Gen12 o_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  