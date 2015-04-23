
  package gen;
  public class T_Gen10 {
  		@com.google.inject.Inject
  		public T_Gen10(T_Gen11 t_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  