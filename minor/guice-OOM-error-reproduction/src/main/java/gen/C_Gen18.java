
  package gen;
  public class C_Gen18 {
  		@com.google.inject.Inject
  		public C_Gen18(C_Gen19 c_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  