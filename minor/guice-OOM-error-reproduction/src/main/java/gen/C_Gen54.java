
  package gen;
  public class C_Gen54 {
  		@com.google.inject.Inject
  		public C_Gen54(C_Gen55 c_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  