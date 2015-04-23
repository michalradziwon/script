
  package gen;
  public class F_Gen30 {
  		@com.google.inject.Inject
  		public F_Gen30(F_Gen31 f_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  