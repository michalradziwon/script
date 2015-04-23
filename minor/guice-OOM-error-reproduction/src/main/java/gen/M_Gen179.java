
  package gen;
  public class M_Gen179 {
  		@com.google.inject.Inject
  		public M_Gen179(M_Gen180 m_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  