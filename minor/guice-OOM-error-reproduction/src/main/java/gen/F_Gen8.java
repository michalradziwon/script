
  package gen;
  public class F_Gen8 {
  		@com.google.inject.Inject
  		public F_Gen8(F_Gen9 f_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  