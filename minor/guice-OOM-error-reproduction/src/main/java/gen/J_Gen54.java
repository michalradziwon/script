
  package gen;
  public class J_Gen54 {
  		@com.google.inject.Inject
  		public J_Gen54(J_Gen55 j_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  