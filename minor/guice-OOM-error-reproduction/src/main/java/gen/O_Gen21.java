
  package gen;
  public class O_Gen21 {
  		@com.google.inject.Inject
  		public O_Gen21(O_Gen22 o_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  