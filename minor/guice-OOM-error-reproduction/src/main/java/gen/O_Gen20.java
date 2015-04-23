
  package gen;
  public class O_Gen20 {
  		@com.google.inject.Inject
  		public O_Gen20(O_Gen21 o_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  