
  package gen;
  public class F_Gen137 {
  		@com.google.inject.Inject
  		public F_Gen137(F_Gen138 f_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  