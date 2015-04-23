
  package gen;
  public class F_Gen162 {
  		@com.google.inject.Inject
  		public F_Gen162(F_Gen163 f_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  