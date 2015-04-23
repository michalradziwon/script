
  package gen;
  public class O_Gen87 {
  		@com.google.inject.Inject
  		public O_Gen87(O_Gen88 o_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  