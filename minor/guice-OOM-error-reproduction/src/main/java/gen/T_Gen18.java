
  package gen;
  public class T_Gen18 {
  		@com.google.inject.Inject
  		public T_Gen18(T_Gen19 t_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  