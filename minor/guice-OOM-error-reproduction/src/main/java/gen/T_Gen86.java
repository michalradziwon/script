
  package gen;
  public class T_Gen86 {
  		@com.google.inject.Inject
  		public T_Gen86(T_Gen87 t_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  