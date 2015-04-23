
  package gen;
  public class T_Gen17 {
  		@com.google.inject.Inject
  		public T_Gen17(T_Gen18 t_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  