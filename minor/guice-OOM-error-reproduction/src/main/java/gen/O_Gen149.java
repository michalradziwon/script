
  package gen;
  public class O_Gen149 {
  		@com.google.inject.Inject
  		public O_Gen149(O_Gen150 o_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  