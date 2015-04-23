
  package gen;
  public class T_Gen43 {
  		@com.google.inject.Inject
  		public T_Gen43(T_Gen44 t_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  