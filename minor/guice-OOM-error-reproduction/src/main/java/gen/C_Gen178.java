
  package gen;
  public class C_Gen178 {
  		@com.google.inject.Inject
  		public C_Gen178(C_Gen179 c_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  