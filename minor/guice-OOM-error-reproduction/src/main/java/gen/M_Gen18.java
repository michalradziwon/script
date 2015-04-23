
  package gen;
  public class M_Gen18 {
  		@com.google.inject.Inject
  		public M_Gen18(M_Gen19 m_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  