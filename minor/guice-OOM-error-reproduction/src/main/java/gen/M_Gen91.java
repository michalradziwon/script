
  package gen;
  public class M_Gen91 {
  		@com.google.inject.Inject
  		public M_Gen91(M_Gen92 m_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  