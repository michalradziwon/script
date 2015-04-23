
  package gen;
  public class O_Gen180 {
  		@com.google.inject.Inject
  		public O_Gen180(O_Gen181 o_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  