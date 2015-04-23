
  package gen;
  public class O_Gen192 {
  		@com.google.inject.Inject
  		public O_Gen192(O_Gen193 o_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  