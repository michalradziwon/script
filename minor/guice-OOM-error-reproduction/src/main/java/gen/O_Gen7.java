
  package gen;
  public class O_Gen7 {
  		@com.google.inject.Inject
  		public O_Gen7(O_Gen8 o_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  