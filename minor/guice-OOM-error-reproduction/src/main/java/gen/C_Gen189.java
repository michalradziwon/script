
  package gen;
  public class C_Gen189 {
  		@com.google.inject.Inject
  		public C_Gen189(C_Gen190 c_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  