
  package gen;
  public class M_Gen102 {
  		@com.google.inject.Inject
  		public M_Gen102(M_Gen103 m_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  