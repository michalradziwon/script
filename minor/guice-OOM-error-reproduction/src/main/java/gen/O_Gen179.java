
  package gen;
  public class O_Gen179 {
  		@com.google.inject.Inject
  		public O_Gen179(O_Gen180 o_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  