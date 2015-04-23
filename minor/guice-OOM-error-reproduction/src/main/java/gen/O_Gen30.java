
  package gen;
  public class O_Gen30 {
  		@com.google.inject.Inject
  		public O_Gen30(O_Gen31 o_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  