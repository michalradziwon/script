
  package gen;
  public class O_Gen70 {
  		@com.google.inject.Inject
  		public O_Gen70(O_Gen71 o_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  