
  package gen;
  public class F_Gen188 {
  		@com.google.inject.Inject
  		public F_Gen188(F_Gen189 f_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  