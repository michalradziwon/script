
  package gen;
  public class O_Gen59 {
  		@com.google.inject.Inject
  		public O_Gen59(O_Gen60 o_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  